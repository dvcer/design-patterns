public class Account {
    private int id;
    private String name;

    private Account() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Builder getBuilder() {
        return new Account().new Builder();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public class Builder {

        private Builder() {

        }

        public Builder withId(int id) {
            Account.this.id = id;
            return this;
        }

        public Builder withName(String name) {
            Account.this.name = name;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}
