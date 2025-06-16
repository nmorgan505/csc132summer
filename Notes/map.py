

squares = list(range(1, 10))

for i in range(len(squares)):
    squares[i] *= squares[i]
    
print(squares)

def f(x):
    if x < 255:
        return 0
    if x < 510:
        return 255
    else:
        return 512

squares = list(map(f, range(1, 513)))
print(squares)