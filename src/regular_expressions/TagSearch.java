package regular_expressions;

/*
Написать программу, выполняющую поиск в строке всех тегов
абзацев, в т.ч. тех, у которых есть параметры,
например <p id ="p1">,
и заменяет их на простые теги абзацев <p>.
 */

public class TagSearch {

    public static void main(String[] args) {

        String regex = "(<p.+>)(.+</p>)";
        String regex1 = "(<p.+?>)(.+?</p>)";
        String input = "<p>asdf gigiug </p> fcfrhr <b> ujkfujktu </b> vgjkcgcvjh cgj  <p> id=\"p1\"vgyujktyk vjkfty</p> +" +
                "gvyukcfyuk <p> hjkcvk <p id=\"p2\"vgyujktyk vjkfty</p>" ;

        System.out.println(input.replaceAll(regex, "<p>$2"));
        System.out.println(input.replaceAll(regex1, "<p>$2"));
    }
}
