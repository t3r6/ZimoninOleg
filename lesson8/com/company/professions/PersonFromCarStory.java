package lesson8.com.company.professions;

public class PersonFromCarStory {
    private String fullName;

    public PersonFromCarStory(String fullName) {
        this.fullName = fullName;
    }
    public PersonFromCarStory(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonFromCarStory that = (PersonFromCarStory) o;

        return fullName != null ? fullName.equals(that.fullName) : that.fullName == null;
    }

    @Override
    public int hashCode() {
        return fullName != null ? fullName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PersonFromCarStory{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
