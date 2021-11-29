## Simple Exercice to train the basics of stubbing and spying

### Stub 

First write tests for exercice.one.stub.BirthdayService

Cover the class BirthdayService, by stubbing the Repository to return true or false
depending on with what name it is called

### Spy
Then do the same thing for exercice.two.spy.BirthdayService
 
Again cover BirthdayService. Since the method greeting has no return value we need to verify that
mailer was called with the correct greeting phrase.

## Fake
Write tests using the fake approach. Instead of using mockito 
write a fake for ClientRepository (using a subclass) and for the 
Mailer with just enough logic to test it