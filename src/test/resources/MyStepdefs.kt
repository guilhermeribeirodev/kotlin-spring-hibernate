import cucumber.api.PendingException
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java8.En
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat

class MyStepdefs : En {
    init {
        Given("^a customer with name 'gui' and surname 'rib' and e-mail 'gui@rib\\.com'$") {
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }
        When("^user requests to quickly create customer$") {
            // Write code here that turns the phrase above into concrete actions
            //throw PendingException()
        }
    }
}
