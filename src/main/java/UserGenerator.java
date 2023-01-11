import io.qameta.allure.Step;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserGenerator {
    @Step("New valid user data")
    public static User getNewValidUser() {
        return new User("nosareffartem1@yandex.ru", "123456", "artem");
    }

    @Step("New user without email")
    public static User getUserWithoutEmail() {
        return new User(null, "123456", "artem");
    }

    @Step("New user without password")
    public static User getUserWithoutPassword() {
        return new User("nosareffartem1@yandex.ru", null, "artem");
    }

    @Step("New user without name")
    public static User getUserWithoutName() {
        return new User("nosareffartem1@yandex.ru", "123456", null);
    }

    @Step("User with changed email")
    public static User getChangedEmailUser() {
        return new User(DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss").format(LocalDateTime.now()) + "nosareffartem1@yandex.ru", "123456", "artem");
    }

    @Step("User with changed password")
    public static User getChangedPasswordUser() {
        return new User("nosareffartem1@yandex.ru", "123456" + DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss").format(LocalDateTime.now()), "artem");
    }

    @Step("User with changed name")
    public static User getChangedNameUser() {
        return new User("nosareffartem1@yandex.ru", "123456", "artem" + DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss").format(LocalDateTime.now()));
    }
}
