class ClientRepository(object):

    def birthdayIsTodayFor(self, name):
        raise Exception('you shouldn\'t call ClientRepository in a unit test as it requires access to the database')