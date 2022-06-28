package supermarket.interfaces;

public interface SuperMarket {

    Merchandise[] getAllMerchandise();

    Merchandise[] getRandomMerchandiseOfCategory(Category category); //获取随机类别的商品

    void addEarnedMoney(double earnedMoney);//挣的钱

    void dailyReport();//日常报告

}
