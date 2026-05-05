# CSCI 160 – Final Exam: Campus Store Inventory Manager

## Overview

You have **2 hours** to complete this assignment. Read all instructions carefully before writing any code.

This exam assesses your ability to apply core Java concepts covered in Chapters 1–14 (excluding Chapter 4). 
You will complete a small campus store inventory system that loads products from a file, manages inventory, and generates a summary report.

To help you save time, all places where you need to modify code are marked with the keyword TODO.  This causes them to appear in the problems tab.  When you are finished with a TODO, delete the comment containing the keyword and it will no longer flag in the problems tab.

*Hint:There are 20 TODO statements, all labeled with the appropriate Test Number.  You can click any TODO in the problems tab to go directly to its location in the code.*

**Compile Command:** javac src/*.java  
**Run Command products1.txt:** java -cp src Main products1.txt  
**Run Command products2.txt:** java -cp src Main products2.txt   

---

## Scenario

The Williston State campus store sells two types of products: **books** and **snacks**. Your program must:

1. Load product data from `products.txt`
2. Store products in an `ArrayList`
3. Allow searching for a product by ID
4. Process purchases and update inventory
5. Handle invalid input gracefully (no crashes)
6. Support polymorphic behavior across product types
7. Compute total inventory value
8. Generate a summary report

---

## products1.txt and products2.txt Format

Each line represents one product:

```
type,id,name,price,quantity[,extra]
```

- `type` is either `BOOK` or `SNACK`
- `id` is a unique string (e.g., `B001`)
- `name` is the product name (no commas)
- `price` is a double
- `quantity` is an int
- For `BOOK`: `extra` is the author name
- For `SNACK`: `extra` is `true` or `false` (gluten-free flag)

Example:
```
BOOK,B001,Intro to Java,89.99,30,John Doe
SNACK,S001,Granola Bar,1.99,100,true
```

---

---

## Grading

Each test = **5 points** (50 total).

| # | Test | Points | Set of Products Used |
|---|------|--------|-----|
| 1 | Product constructor, Getters and setters work; `setQuantity` rejects negatives | 5 | products1.txt |
| 2 | `toString()` returns correctly formatted string | 5 | products1.txt |
| 3 | `loadProducts()` reads file and populates ArrayList | 5 | products1.txt |
| 4 | `findProductById()` returns correct product or null | 5 | products1.txt |
| 5 | `findProductById()` returns correct product or null | 5 | products2.txt |
| 6 | `purchaseProduct()` updates quantity or returns appropriate output | 5 | products1.txt |
| 7 | Subclass `getCategory()` and `getPriceWithTax()` polymorphism (Tax is included where necessary) | 5 | products2.txt |
| 8 | `totalInventoryValue()` returns correct total | 5 | products1.txt |
| 9 | `totalInventoryValue()` returns correct total | 5 | products2.txt |
| 10 | `getSummary()` returns non-empty string with product info | 5 | products1.txt

**Note:** Each test will search for appropriate fragments of the expected output below.  I suggest opening the Actions Tab and reading your auto grader results closely.  
**You can open OUTPUTS.md to see the expected output checked for each individual test**

---

## Submission
Commit and push all changes to your assigned GitHub Classroom repository before time is called. Only the last commit before the deadline will be graded.
**Do not modify** `products1.txt` or `products2.txt`

## Expected Final Output - products1.txt  
```
Attempting to find S005
null

Invalid Quantity!
After attempting to set B002 quantity to -5:
[B002] Data Structures in Java - $74.5 (qty: 15)

Updated quantity to 17
After attempting to set B002 quantity to 17:
[B002] Data Structures in Java - $74.5 (qty: 17)

=== Campus Store Inventory ===
[B001] Intro to Java - $89.99 (qty: 30)
[B002] Data Structures in Java - $74.5 (qty: 17)
[B003] Calculus for Engineers - $120.0 (qty: 10)
[S001] Granola Bar - $1.99 (qty: 100)
[S002] Chips - $0.99 (qty: 200)
[S003] Protein Bar - $2.49 (qty: 75)
[B004] Computer Science Fundamentals - $95.0 (qty: 20)
[S004] Fruit Snacks - $1.49 (qty: 150)

=== Purchase ===
Updated quantity to 17
[B001] Intro to Java - $89.99 (qty: 17)

=== Purchase ===
Invalid Purchase Attempt!

=== Summary ===
Products: 8 | Total units: 589 | Total inventory value: 6703.58 | Most expensive: Calculus for Engineers
```

## Expected Final Output - products2.txt  
```
Attempting to find S005
[S005] Popcorn - $1.59 (qty: 160)

Invalid Quantity!
After attempting to set B002 quantity to -5:
[B002] Introduction to Databases - $85.25 (qty: 18)

Updated quantity to 17
After attempting to set B002 quantity to 17:
[B002] Introduction to Databases - $85.25 (qty: 17)

=== Campus Store Inventory ===
[B001] Advanced Algorithms - $110.75 (qty: 12)
[B002] Introduction to Databases - $85.25 (qty: 17)
[B003] Discrete Mathematics Essentials - $69.99 (qty: 25)
[B004] Object-Oriented Design - $92.0 (qty: 14)
[S001] Trail Mix - $2.99 (qty: 90)
[S002] Chocolate Cookies - $3.49 (qty: 120)
[S003] Rice Cakes - $1.89 (qty: 80)
[S004] Pretzels - $2.29 (qty: 140)
[B005] Operating Systems Basics - $105.5 (qty: 9)
[S005] Popcorn - $1.59 (qty: 160)

=== Purchase ===
Invalid Purchase Attempt!

=== Purchase ===
Updated quantity to 7
[B005] Operating Systems Basics - $105.5 (qty: 7)

=== Summary ===
Products: 10 | Total units: 665 | Total inventory value: 7968.6 | Most expensive: Advanced Algorithms
```