public class Pies {

    private int czasPosilku;

    public void UstawCzasPosilku(int czas)
    {
        this.czasPosilku = czas;
    }

    public int PobierzCzasPosilku()
    {
        return czasPosilku;
    }

    public Boolean PotrzebnySpacer()
    {
        if (czasPosilku > 5) return true;
        else return false;
    }
}
