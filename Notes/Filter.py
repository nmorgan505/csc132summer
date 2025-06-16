


multiples = []

for i in range(3, 31):
	if (i % 3 == 0 or i % 5 == 0):
		multiples.append(i)

print(multiples)

def f(x):
	return (x % 3 == 0 or x % 5 == 0)

multiples = list(filter(f, range(3, 31)))

print(multiples)
