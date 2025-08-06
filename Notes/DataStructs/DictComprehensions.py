

numbers = range(1,5)
squares = {x: x**2 for x in numbers}
print(f"Square Dictionary: {squares}\n")


keys = ['a', 'b', 'c']
values = [1, 2, 3]
associative_dict = {k: v for k, v in zip(keys, values)}
#associative_dict2 = {k: v for k in keys for v in values}
print(f"Associative Dictionary: {associative_dict}\n")

even_squares = {x: x**2 for x in range(15) if x % 2 ==0}
print(f"Even Squares: {even_squares}\n")

reversed_squares = {v: k for k, v in even_squares.items()}
print(f"Reversed Even Squares: {reversed_squares}\n")
