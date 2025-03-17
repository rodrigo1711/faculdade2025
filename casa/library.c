#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_BOOKS 100
#define TITLE_LENGTH 100
#define AUTHOR_LENGTH 100

typedef struct {
    int id;
    char title[TITLE_LENGTH];
    char author[AUTHOR_LENGTH];
} Book;

Book library[MAX_BOOKS];
int bookCount = 0;

void addBook() {
    if (bookCount >= MAX_BOOKS) {
        printf("Library is full! Cannot add more books.\n");
        return;
    }

    Book newBook;
    newBook.id = bookCount + 1; // Simple ID assignment
    printf("Enter book title: ");
    getchar(); // Clear newline from buffer
    fgets(newBook.title, TITLE_LENGTH, stdin);
    newBook.title[strcspn(newBook.title, "\n")] = 0; // Remove newline character

    printf("Enter author name: ");
    fgets(newBook.author, AUTHOR_LENGTH, stdin);
    newBook.author[strcspn(newBook.author, "\n")] = 0; // Remove newline character

    library[bookCount] = newBook;
    bookCount++;
    printf("Book added successfully!\n");
}

void displayBooks() {
    if (bookCount == 0) {
        printf("No books in the library.\n");
        return;
    }

    printf("\nLibrary Books:\n");
    for (int i = 0; i < bookCount; i++) {
        printf("ID: %d, Title: %s, Author: %s\n", library[i].id, library[i].title, library[i].author);
    }
}

void searchBook() {
    char searchTitle[TITLE_LENGTH];
    printf("Enter the title of the book to search: ");
    getchar(); // Clear newline from buffer
    fgets(searchTitle, TITLE_LENGTH, stdin);
    searchTitle[strcspn(searchTitle, "\n")] = 0; // Remove newline character

    int found = 0;
    for (int i = 0; i < bookCount; i++) {
        if (strcasecmp(library[i].title, searchTitle) == 0) {
            printf("Book found! ID: %d, Title: %s, Author: %s\n", library[i].id, library[i].title, library[i].author);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Book not found.\n");
    }
}

void menu() {
    int choice;
    do {
        printf("\nLibrary Management System\n");
        printf("1. Add Book\n");
        printf("2. Display Books\n");
        printf("3. Search Book\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                displayBooks();
                break;
            case 3:
                searchBook();
                break;
            case 4:
                printf("Exiting the program.\n");
                break;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    } while (choice != 4);
}

int main() {
    menu();
    return 0;
}