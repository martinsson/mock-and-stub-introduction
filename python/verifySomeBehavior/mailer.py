class Mailer(object):

    def send(self, mail_content):
        raise Exception('you shouldn\'t call the mailer in a unit test in requires network access')