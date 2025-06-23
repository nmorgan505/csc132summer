from functools import reduce

def f(x, y):
    return x * y
fact = reduce(f, range(1, 11))
print(fact)

fact = 1
for i in range(1, 11):
    fact *= i

print(fact)