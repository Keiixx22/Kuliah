#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <time.h>

int main(int argc, char *argv[]) {
    struct stat file;

    if (argc != 2) {
        printf("Usage: ./stat_info <filename>\n");
        exit(EXIT_FAILURE);
    }

    if (stat(argv[1], &file) == -1) {
        perror(argv[1]);
        exit(EXIT_FAILURE);
    }

    printf("User id          : %u\n", (unsigned int)file.st_uid);
    printf("Group id         : %u\n", (unsigned int)file.st_gid);
    printf("Block size       : %ld\n", (long)file.st_blksize);
    printf("Blocks allocated : %ld\n", (long)file.st_blocks);
    printf("Inode number     : %llu\n",
           (unsigned long long)file.st_ino);

    printf("Last accessed   : %s", ctime(&file.st_atime));
    printf("Last modified   : %s", ctime(&file.st_mtime));

    printf("File size        : %lld bytes\n",
           (long long)file.st_size);

    printf("Number of links  : %lu\n",
           (unsigned long)file.st_nlink);

    printf("Permissions      : ");

    printf("%c", S_ISDIR(file.st_mode) ? 'd' :
                  S_ISREG(file.st_mode) ? '-' : '?');

    printf("%c", (file.st_mode & S_IRUSR) ? 'r' : '-');
    printf("%c", (file.st_mode & S_IWUSR) ? 'w' : '-');
    printf("%c", (file.st_mode & S_IXUSR) ? 'x' : '-');

    printf("%c", (file.st_mode & S_IRGRP) ? 'r' : '-');
    printf("%c", (file.st_mode & S_IWGRP) ? 'w' : '-');
    printf("%c", (file.st_mode & S_IXGRP) ? 'x' : '-');

    printf("%c", (file.st_mode & S_IROTH) ? 'r' : '-');
    printf("%c", (file.st_mode & S_IWOTH) ? 'w' : '-');
    printf("%c\n", (file.st_mode & S_IXOTH) ? 'x' : '-');

    if (S_ISREG(file.st_mode)) {
        printf("File type        : Regular\n");
    }

    if (S_ISDIR(file.st_mode)) {
        printf("File type        : Directory\n");
    }

    return 0;
}