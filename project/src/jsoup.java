import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class jsoup {
    public static void main(String[] args) {
        try {
            String url = "https://wiki.com/"; // URL của trang web OpenSea

            // Kết nối và lấy dữ liệu từ URL
            Document document = Jsoup.connect(url).get();

            // In ra nội dung trang web
            System.out.println(document.html());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
