#include <stdio.h>
#include <dirent.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    struct dirent *dptr;
    DIR *dname;

    if (argc != 2) {
        printf("Usage: ./dirlist <dirname>\n");
        exit(EXIT_FAILURE);
    }

    if ((dname = opendir(argv[1])) == NULL) {
        perror(argv[1]);
        exit(EXIT_FAILURE);
    }

    while ((dptr = readdir(dname)) != NULL) {
        printf("%s\n", dptr->d_name);
    }

    closedir(dname);

    return 0;
}