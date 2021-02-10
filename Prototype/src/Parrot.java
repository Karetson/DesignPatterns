public class Parrot extends Animal{
    public String wings;

    public Parrot() {

    }

    public Parrot(Parrot target) {
        super(target);
        if (target != null) {
            this.wings = target.wings;
        }
    }

    @Override
    public Animal clone() {
        return new Parrot(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Parrot) || !super.equals(obj)) {
            return false;
        }
        Parrot parrot = (Parrot) obj;
        return parrot.wings == wings;
    }
}
