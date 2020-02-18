package Capitulo10;

public class ScentedCandle extends Candle{
    
    private Scent scent;
    
    public static final Integer PRICE = 3;

    @Override
    public Integer getHeight() {
        return super.getHeight();
    }

    public Scent getScent() {
        return scent;
    }

    public void setScent(Scent scent) {
        this.scent = scent;
    }
    
    @Override
    public void setHeight(Integer height){
        super.setHeight(height);
        super.setPrice(PRICE * height);
    }
    
}
