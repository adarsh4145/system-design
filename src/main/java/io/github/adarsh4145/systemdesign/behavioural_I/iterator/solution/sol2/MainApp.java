package io.github.adarsh4145.systemdesign.behavioural_I.iterator.solution.sol2;


public class MainApp {
    public static void main(String[] args) throws Exception {
    BrowserHistory browserHistory = new ListBrowserHistory();

        browserHistory.push("url1");
        browserHistory.push("url2");

        browserHistory.pop();
        browserHistory.push("url3");


        Iterator iterator = browserHistory.createIterator();

        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }
}
