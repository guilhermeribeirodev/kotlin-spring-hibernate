Feature:
  Scenario: Customer is created
    Given a customer with name 'gui' and surname 'rib' and e-mail 'gui@rib.com'
    When user requests to quickly create customer
    Then a customer is created with id = 1
