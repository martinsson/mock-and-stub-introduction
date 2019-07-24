class BirthdayService(object):

    def __init__(self, client_repository, mailer):
        self.mailer = mailer
        self.client_repository = client_repository

    def greeting(self, name):
        if self.client_repository.birthdayIsTodayFor(name):
            greeting = 'Happy birthday ' + name + '!'
        else:
            greeting = ''

        self.mailer.send(greeting)


