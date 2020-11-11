package duckduckgo;

import business.ui.pages.DuckduckgoPage;
import business.ui.pages.WikiPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static io.restassured.RestAssured.given;

public class DuckduckgoLayer2Test {

    private final static String UI_URL = "https://duckduckgo.com";
    private final static String API_URL = "http://duckduckgo.com";
    private final static String JSON_API_RESPONSE = "{\"AbstractURL\":\"https://en.wikipedia.org/wiki/Wikipedia_(disambiguation)\",\"Definition\":\"\",\"Image\":\"\",\"RelatedTopics\":[{\"FirstURL\":\"https://duckduckgo.com/Wikipedia\",\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia\\\">Wikipedia</a> A multilingual online encyclopedia created and maintained as an open collaboration project by...\",\"Text\":\"Wikipedia A multilingual online encyclopedia created and maintained as an open collaboration project by...\",\"Icon\":{\"URL\":\"https://duckduckgo.com/i/a96348db.png\",\"Width\":\"\",\"Height\":\"\"}},{\"FirstURL\":\"https://duckduckgo.com/Wikimedia_Foundation\",\"Text\":\"Wikimedia Foundation The Wikimedia Foundation, Inc. is an American non-profit and charitable organization...\",\"Icon\":{\"Height\":\"\",\"Width\":\"\",\"URL\":\"https://duckduckgo.com/i/080ff557.png\"},\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikimedia_Foundation\\\">Wikimedia Foundation</a>The Wikimedia Foundation, Inc. is an American non-profit and charitable organization...\"},{\"Text\":\"274301 Wikipedia A Vestian asteroid orbiting in the inner region of the asteroid belt, approximately 1 kilometer...\",\"Icon\":{\"Width\":\"\",\"URL\":\"https://duckduckgo.com/i/099aa205.png\",\"Height\":\"\"},\"Result\":\"<a href=\\\"https://duckduckgo.com/274301_Wikipedia\\\">274301 Wikipedia</a>A Vestian asteroid orbiting in the inner region of the asteroid belt, approximately 1 kilometer...\",\"FirstURL\":\"https://duckduckgo.com/274301_Wikipedia\"},{\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia_Monument\\\">Wikipedia Monument</a> A statue designed by Armenian sculptor Mihran Hakobyan honoring Wikipedia contributors.\",\"Text\":\"Wikipedia Monument A statue designed by Armenian sculptor Mihran Hakobyan honoring Wikipedia contributors.\",\"Icon\":{\"Height\":\"\",\"Width\":\"\",\"URL\":\"\"},\"FirstURL\":\"https://duckduckgo.com/Wikipedia_Monument\"},{\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia_community\\\">Wikipedia community</a>The community of contributors who create and maintain the online encyclopedia Wikipedia.\",\"Text\":\"Wikipedia community The community of contributors who create and maintain the online encyclopedia Wikipedia.\",\"Icon\":{\"URL\":\"https://duckduckgo.com/i/5b187342.jpg\",\"Width\":\"\",\"Height\":\"\"},\"FirstURL\":\"https://duckduckgo.com/Wikipedia_community\"},{\"Topics\":[{\"FirstURL\":\"https://duckduckgo.com/Wikipedia_Seigenthaler_biography_incident\",\"Text\":\"Wikipedia Seigenthaler biography incident In May 2005, an unregistered editor posted a hoax article onto Wikipedia about journalist John...\",\"Icon\":{\"URL\":\"https://duckduckgo.com/i/46bdd424.jpg\",\"Width\":\"\",\"Height\":\"\"},\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia_Seigenthaler_biography_incident\\\">Wikipedia Seigenthaler biography incident</a>In May 2005, an unregistered editor posted a hoax article onto Wikipedia about journalist John...\"},{\"Text\":\"La R\\u00e9volution Wikip\\u00e9dia A multi-authored study of Wikipedia focusing on the online encyclopedia's reliability and its...\",\"Icon\":{\"URL\":\"https://duckduckgo.com/i/7f24b3a0.jpg\",\"Width\":\"\",\"Height\":\"\"},\"Result\":\"<a href=\\\"https://duckduckgo.com/La_R%C3%A9volution_Wikip%C3%A9dia\\\">La R\\u00e9volution Wikip\\u00e9dia</a> A multi-authored study of Wikipedia focusing on the online encyclopedia's reliability and its...\",\"FirstURL\":\"https://duckduckgo.com/La_R%C3%A9volution_Wikip%C3%A9dia\"},{\"Icon\":{\"Height\":\"\",\"Width\":\"\",\"URL\":\"\"},\"Text\":\"Wikipedia: The Missing Manual A 2008 how-to book by John Broughton.\",\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia_%E2%80%93_The_Missing_Manual\\\">Wikipedia: The Missing Manual</a> A 2008 how-to book by John Broughton.\",\"FirstURL\":\"https://duckduckgo.com/Wikipedia_%E2%80%93_The_Missing_Manual\"},{\"FirstURL\":\"https://duckduckgo.com/?q=Wikipedia%20%E2%80%93%20A%20New%20Community%20of%20Practice%3F\",\"Result\":\"<a href=\\\"https://duckduckgo.com/?q=Wikipedia%20%E2%80%93%20A%20New%20Community%20of%20Practice%3F\\\">Wikipedia: A New Community of Practice</a> A 2009 book by Dan O'Sullivan.\",\"Icon\":{\"Width\":\"\",\"URL\":\"\",\"Height\":\"\"},\"Text\":\"Wikipedia: A New Community of Practice A 2009 book by Dan O'Sullivan.\"},{\"FirstURL\":\"https://duckduckgo.com/Wikipedia_in_culture\",\"Text\":\"Wikipedia in culture References to Wikipedia in popular culture have increased as more people learn about and use the...\",\"Icon\":{\"Width\":\"\",\"URL\":\"https://duckduckgo.com/i/c4486484.jpg\",\"Height\":\"\"},\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia_in_culture\\\">Wikipedia in culture</a>References to Wikipedia in popular culture have increased as more people learn about and use the...\"},{\"Icon\":{\"Width\":\"\",\"URL\":\"https://duckduckgo.com/i/1d102189.png\",\"Height\":\"\"},\"Text\":\"Wikipedia Review An Internet forum and blog for the discussion of Wikimedia Foundation projects, in particular the...\",\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedia_Review\\\">Wikipedia Review</a>An Internet forum and blog for the discussion of Wikimedia Foundation projects, in particular the...\",\"FirstURL\":\"https://duckduckgo.com/Wikipedia_Review\"},{\"FirstURL\":\"https://duckduckgo.com/Wikipedian_in_residence\",\"Icon\":{\"Width\":\"\",\"URL\":\"\",\"Height\":\"\"},\"Text\":\"Wikipedian in residence A Wikipedia editor, a Wikipedian, who accepts a placement with an institution, typically an art...\",\"Result\":\"<a href=\\\"https://duckduckgo.com/Wikipedian_in_residence\\\">Wikipedian in residence</a>A Wikipedia editor, a Wikipedian, who accepts a placement with an institution, typically an art...\"}],\"Name\":\"See also\"}],\"AbstractSource\":\"Wikipedia\",\"DefinitionURL\":\"\",\"Type\":\"D\",\"DefinitionSource\":\"\",\"ImageHeight\":0,\"ImageIsLogo\":0,\"Results\":[],\"ImageWidth\":0,\"Abstract\":\"\",\"AbstractText\":\"\",\"Redirect\":\"\",\"Answer\":\"\",\"Heading\":\"Wikipedia\",\"AnswerType\":\"\",\"Entity\":\"\",\"Infobox\":\"\",\"meta\":{\"status\":\"live\",\"description\":\"Wikipedia\",\"maintainer\":{\"github\":\"duckduckgo\"},\"example_query\":\"nikola tesla\",\"perl_module\":\"DDG::Fathead::Wikipedia\",\"src_domain\":\"en.wikipedia.org\",\"topic\":[\"productivity\"],\"attribution\":null,\"name\":\"Wikipedia\",\"producer\":null,\"signal_from\":\"wikipedia_fathead\",\"is_stackexchange\":null,\"dev_milestone\":\"live\",\"src_url\":null,\"dev_date\":null,\"src_name\":\"Wikipedia\",\"tab\":\"About\",\"live_date\":null,\"developer\":[{\"type\":\"ddg\",\"name\":\"DDG Team\",\"url\":\"http://www.duckduckhack.com\"}],\"unsafe\":0,\"designer\":null,\"created_date\":null,\"js_callback_name\":\"wikipedia\",\"production_state\":\"online\",\"src_options\":{\"skip_qr\":\"\",\"min_abstract_length\":\"20\",\"is_mediawiki\":1,\"skip_end\":\"0\",\"language\":\"en\",\"is_wikipedia\":1,\"skip_abstract\":0,\"directory\":\"\",\"is_fanon\":0,\"source_skip\":\"\",\"skip_abstract_paren\":0,\"skip_image_name\":0,\"skip_icon\":0,\"src_info\":\"\"},\"src_id\":1,\"id\":\"wikipedia_fathead\",\"repo\":\"fathead\",\"blockgroup\":null}}";


    private final static String WIKIPEDIA = "wikipedia";


    @Test
    public void api_test() {
        Response response = given()
                .contentType("application/json")
                .when()
                .param("q", "wikipedia")
                .param("format", "json")
                .get("http://duckduckgo.com");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.getBody().jsonPath().get("AbstractURL"), "https://en.wikipedia.org/wiki/Wikipedia_(disambiguation)");
    }

    @Test
    public void ui_test() {
        DuckduckgoPage.open();
        DuckduckgoPage duckduckgoPage = new DuckduckgoPage();
        duckduckgoPage.search().sendKeys(WIKIPEDIA);
        duckduckgoPage.submit();
        duckduckgoPage.searchResults().get(0).click();

        Selenide.open(UI_URL);
        $x("//input[@name='q']").sendKeys(WIKIPEDIA);
        $x("//input[@type='submit']").click();
        $x("//*[@class='result__a']").click();

        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://en.wikipedia.org/wiki/Main_Page");

        WebDriverRunner.closeWebDriver();
    }

}
