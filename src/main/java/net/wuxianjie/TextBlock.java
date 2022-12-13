package net.wuxianjie;

public class TextBlock {

    public static String oldWayHtmlText() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"zh-CN\">\n" +
                "   <head>\n" +
                "       <title>标题</title>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "       <p>你好 HTML</p>\n" +
                "   </body>\n" +
                "</html>\n";
    }

    public static String textBlockHtml() {
        return """
                <!DOCTYPE html>
                <html lang="zh-CN">
                   <head>
                       <title>标题</title>
                   </head>
                   <body>
                       <p>你好 HTML</p>
                   </body>
                </html>
                """;
    }

    public static void main(String[] args) {
        System.out.println(oldWayHtmlText());

        System.out.println(textBlockHtml());
    }
}
