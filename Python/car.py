from account import Account


class Car:
    id = int
    license = str
    driver = Account("","")
    passenger = str
    
    def __init__(self,license,driver) -> None:
        self.license = license
        self.driver = driver
    def print_data(self):
        print(f"Licencia:{self.license} Conductor:{self.driver}")