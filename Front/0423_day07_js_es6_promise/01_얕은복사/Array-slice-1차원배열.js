const original = [1, 2, 3, 4, 5]
const copied = original.slice()

console.log(JSON.stringify(original) === JSON.stringify(copied)) // true

// copied.push(6)
// original.push(6)
// copied[0] = 10
original[0]= 10

console.log(JSON.stringify(original) === JSON.stringify(copied)) // false

console.log(original) // [1, 2, 3, 4, 5]
console.log(copied)   // [1, 2, 3, 4, 5, 6] 


// primitive type이 추가됐을 뿐