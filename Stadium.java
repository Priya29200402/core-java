class Stadium {
    String name;
    int capacity;

    Stadium() {
        this.name = name;
        this.capacity = 0;
        System.out.println("Creating Stadium without arguments");
    }

    Stadium(String name) {
        this.name = name;
        System.out.println("Created Stadium with String constructor");
    }

    Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        System.out.println("Created Stadium with String, int constructor");
    }
}