public class Cat extends Animal{
    public String tail;

    public Cat() {

    }

    public Cat (Cat target) {
        super(target);
        if (target != null) {
            this.tail = target.tail;
        }
    }

    @Override
    public Animal clone() {
        return new Cat(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat) || !super.equals(obj)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return cat.tail == tail;
    }
}
