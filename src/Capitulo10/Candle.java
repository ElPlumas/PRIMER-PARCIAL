package Capitulo10;

public class Candle {
    
    private Color_1 color;
    private Integer height;
    private Integer price;
    
    public static final Integer PRICE = 2;

    public Color_1 getColor() {
        return color;
    }

    public void setColor(Color_1 color) {
        this.color = color;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
        this.price = this.PRICE * height;
    }

    public Integer getPrice() {
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        
        candle.setColor(Color_1.BLANCO);
        candle.setHeight(3);
        System.out.println("Candle color : " + candle.getColor() +
                "\nCandle height: " + candle.getHeight() +
                "\nCandle price : $" + candle.getPrice());
        
        scentedCandle.setScent(Scent.ALMENDRA);
        scentedCandle.setColor(Color_1.AZUL);
        scentedCandle.setHeight(3);
        System.out.println("\n\nScented candle: " + scentedCandle.getScent() +
                "\nScented candle color: " + scentedCandle.getColor() +
                "\nScented candle height: " + scentedCandle.getHeight() +
                "\nScented candle price: $" + scentedCandle.getPrice());
        
    }
    
    
}
