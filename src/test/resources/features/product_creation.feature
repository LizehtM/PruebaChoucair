#author: Evelin Lizeht Muñoz Durango
#email: evelinliz.2199@gmail.com

Feature: Successfully log in to the StartSharp page and create a product
  Web user can login
  on the StartSharp page
  to create a product

  Scenario: The user logs in and successfully creates a product

    Given the user enters the StartSharp page and logs in

    When the user creates a product

      | productName | companyName | categoryName | unitsInStock | unitsOrOrder | reorderLevel |
      | shirt3      | studioK     | Confections  | 24           | 45           | 16           |

    Then validate that the creation of the product is successful