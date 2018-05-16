Feature:
  Scenario: Customer is created
    Given a customer with name 'gui' and surname 'rib' and e-mail 'gui@rib.com'
    When user requests to quickly create customer
    Then a customer is created with id = 1

  Scenario: Customer different  is created
    Given a customer with name 'guid' and surname 'rib12' and e-mail 'gui@rib.com'
    When user requests to quickly create customer
    Then a customer is created with id = 2