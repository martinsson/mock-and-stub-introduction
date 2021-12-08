package kata;

import clients.ClientRepository;
import notification.Mailer;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BirthdayServiceTest {

    ClientRepository repository = mock(ClientRepository.class);
    Mailer mailer = mock(Mailer.class);
    BirthdayService birthdayService = new BirthdayService(repository, mailer);

    @Test
    public void classicVersion() {

        // Given
        Mockito.when(repository.birthdayIsTodayFor("bob")).thenReturn(true);
        ArgumentCaptor<String> greeting = ArgumentCaptor.forClass(String.class);

        // When
        birthdayService.greeting("bob");

        // Then
        Mockito.verify(mailer).send("Happy birthday bob!");
    }

    @Test
    public void argumentCaptors() {

        // Given
        Mockito.when(repository.birthdayIsTodayFor("bob")).thenReturn(true);
        ArgumentCaptor<String> greeting = ArgumentCaptor.forClass(String.class);

        // When
        birthdayService.greeting("bob");

        // Then
        Mockito.verify(mailer).send(greeting.capture());
        assertThat(greeting.getValue()).contains("Happy birthday");
    }

    @Test
    public void matchers() {

        // Given
        Mockito.when(repository.birthdayIsTodayFor("bob")).thenReturn(true);

        // When
        birthdayService.greeting("bob");

        // Then
        Mockito.verify(mailer).send(Matchers.contains("Happy birthday"));
    }
}
