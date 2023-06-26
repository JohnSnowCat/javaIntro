package lesson3.homework.task3;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Books {
    String name;
    String lastNameOfAuthor;
    int price;
    int publicationDate;
    int numberOfPage;


    public Books(String name, String lastNameOfAuthor, int price, int publicationDate, int numberOfPage) {
        this.name = name;
        this.lastNameOfAuthor = lastNameOfAuthor;
        this.price = price;
        this.publicationDate = publicationDate;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", lastNameOfAuthor='" + lastNameOfAuthor + '\'' +
                ", price=" + price +
                ", publicationDate=" + publicationDate +
                ", numberOfPage=" + numberOfPage +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastNameOfAuthor() {
        return lastNameOfAuthor;
    }

    public int getPrice() {
        return price;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastNameOfAuthor(String lastNameOfAuthor) {
        this.lastNameOfAuthor = lastNameOfAuthor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
