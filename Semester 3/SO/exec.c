#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
    pid_t pid;
    int i;

    if (argc != 3) {
        printf("Insufficient arguments to load program\n");
        printf("Usage: ./exec <path> <cmd>\n");
        exit(-1);
    }

    switch (pid = fork()) {

        case -1:
            printf("Fork failed!\n");
            exit(-1);

        case 0:
            printf("Child process\n");

            i = execl(argv[1], argv[2], (char *)NULL);

            if (i < 0) {
                printf("%s program not loaded using exec system call\n",
                       argv[2]);
                exit(-1);
            }

        default:
            wait(NULL);
            printf("Child Terminated\n");
            exit(0);
    }

    return 0;
}