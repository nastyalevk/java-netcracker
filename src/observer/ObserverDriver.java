package observer;

public class ObserverDriver {
    public static void main(String[] args) {
        //hand written observer
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews() + "   news");
    }

}
