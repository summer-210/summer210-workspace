package ls09.ex01;

public class RandomPerson implements Person{
    private String _name;
    private double _fame;
    private double _love;
    private double _money;
    private double _fame_factor;
    private double _love_factor;
    private double _money_factor;


    public RandomPerson() {
        _name = RandomPerson.generateName();
        _fame = Math.random();
        _love = Math.random();
        _money = Math.random();
        _fame_factor = Math.random();
        _love_factor = Math.random();
        _money_factor = Math.random();
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getFame() {
        return _fame;
    }

    @Override
    public double getLove() {
        return _love;
    }

    @Override
    public double getMoney() {
        return _money;
    }

    @Override
    public double getHappiness() {
        return (_fame * _fame_factor + _love * _love_factor + _money * _money_factor) /
                (_fame_factor+_love_factor+_money_factor);
    }

    @Override
    public String toString() {
        return getName() + String.format(" (%.2f)", getHappiness());
    }

    private static String generateName() {
        String[] firsts = {"Abe", "Barney", "Chuck", "Evelyn", "Fran", "Geraldine"};
        String[] lasts = {"Patel", "Shah", "Gaasche", "Gupta", "Mayer", "Kray"};

        return firsts[(int) (Math.random()*firsts.length)] +
                " " + lasts[(int) (Math.random()*lasts.length)];
    }
}
