import java.net.URL;

public class url {
    public static void main(String[] args) {
    try{
        // SHORTCUT :- PHQFPP
        URL url = new URL("https://chat.openai.com/?model=text-davinci-002-render-sha");
        System.out.println("protocol" + url.getProtocol()); // protocol is the access resourse comman resourse HTTP , HTTPS 
        System.out.println("host" + url.getHost());// domain name EX:- WWW.EXAMPLE.COM
        System.out.println("port" + url.getPort());// port number to connect to the host example 80 for HTTP 443 FOR HTTPS 
        System.out.println("path" + url.getPath());// path and resorse on the resorse 
        System.out.println("Query" + url.getQuery()); // optional component that provide parameter or data to resourse 
        System.out.println("fragment" + url.getRef()); // used in web address to jump over the specific part of the web page 
    } catch(Exception e){
        e.printStackTrace();
    }
    }
}
