def calculate(candidates, target, count):
	if target in candidates:
		return 0
		
	temp = []
	for candidate in candidates:
		temp.append(candidate + 1)
		temp.append(candidate - 1)
		temp.append(candidate * 2)
		
	count = calculate(temp, target, count + 1) + 1
	return count
	
def solution(number, target):
	answer = 0
	answer_candidate = [number]
	calculate(answer_candidate, target, 0)
	return answer


print(solution(5,9))