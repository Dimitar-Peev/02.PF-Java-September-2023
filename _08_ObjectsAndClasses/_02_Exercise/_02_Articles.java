import java.util.Scanner;

public class _02_Articles {
    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        public void edit (String newContent) {
            this.content = newContent;
        }

        public void changeAuthor (String newAuthor) {
            this.author = newAuthor;
        }

        public void rename (String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Article article = new Article(title, content, author);

        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countCommands; count++) {
            String[] command = scanner.nextLine().split(": ");

            String commandName = command[0];
            String commandParam = command[1];

            switch (commandName) {
                case "Edit":
                    article.edit(commandParam);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParam);
                    break;
                case "Rename":
                    article.rename(commandParam);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
