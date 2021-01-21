package l20_Enum;

public class EnumExample {
    enum CoffeeSize {
        SMALL(100), MEDIUM(200), LARGE(300) {
            String getCoffeeClass() {
                return "D";
            }
        };
        String coffeeClass = "A";
        int capacity;

        CoffeeSize(int capacity) {
            this.capacity = capacity;
        }

        int getCapacity() {
            return capacity;
        }

        String getCoffeeClass() {
            return coffeeClass;
        }
    }

    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.SMALL;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.capacity);
    }
}
