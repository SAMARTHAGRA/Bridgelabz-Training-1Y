package LibrarySystem;
class Book {
    private int id;
    private String name;
    private String author;
    private boolean isIssued;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + author + " | " + (isIssued ? "Issued" : "Available"));
    }
}