#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    int i;
    pid_t pid;
    pid = fork();

    if (pid < 0) {
        printf("\nPembuatan proses gagal\n");
        exit(-1);
    }
    else if (pid > 0) {
        wait(NULL);
        printf("\nParent Starts\nNomor Genap: ");
        for (i = 2; i < 10; i += 2)
            printf("%d ", i);
        printf("\nParent ends\n");
    }
    else {
        printf("\nChild starts\nNomor Ganjil: ");
        for (i = 1; i < 10; i += 2)
            printf("%d ", i);
        printf("\nChild Ends");
    }
    return 0;
}