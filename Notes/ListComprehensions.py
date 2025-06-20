

squares = [x**2 for x in range(10)]
print(f"Squares: {squares}\n")

even_squares = [x**2 for x in range(100) if x % 2 == 0 ]
print(f"Even Squares: {even_squares}\n")

if_else_example = ['even' if x % 2 == 0 else 'odd' for x in range(15)]
print(f"If else example: {if_else_example}\n")

two_variables = [(x, y) for x in range(4) for y in range(3)]
print(f"Two variable example:{two_variables}\n")

tuple_example = [(x, y) for x in range(1,4) for y in [3, 1, 4] if x != y]
print(f"Tuple example: {tuple_example}\n")

divisibility_example = [x for x in range(101) if x % 15 == 0 or x % 8 == 0]
print(f"Divisibility Example: {divisibility_example}\n")
