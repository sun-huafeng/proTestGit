/**
 * Created by Sun on 2018/01/18.
 */

// 变量不会被提升

//console.log(a);
//var a = 'hello';

// es5
//var a;
//console.log(a);
//a = 'hello';
// undifind

// es6
//console.log(a);
//let a;
//a = 'hello';
// Uncaught ReferenceError: a is not defined


// const 定义常量
var name = 'const';
name = 'const1';

//const name1 = 'const';
//name1 = 'const1';
// Assignment to constant variable.

// 继承
class Animal {
    constructor () { this.type = 'animal';}
    says (say) {
        console.log(this.type + " says " + say)
    }
}
let animal = new Animal();
animal.says('hello');

class Cat extends Animal {
    constructor () {super();this.type = 'cat';}
}
let cat = new Cat();
cat.says('hello');

// 箭头函数
// setTimeout 中的this指向全局

//es5
var arr = [1,2,3];
var arr1 = arr.map(function (x) {
    return x + 1;
});
console.log(arr1);

//es6
let arr2 = [1,2,3];
//let arr3 = arr2.map( (x) => {x + 1});
let arr4 = arr2.map( x => x + 1);
//console.log(arr3);
console.log(arr4);

// template string  (模板字符串)

// es5
var msg = 'Hi \man!';
console.log(msg);
//es6
const msg1 = `
hello word
`;
console.log(msg1);

// include repeat
let str = 'haha';
console.log(str.includes('ha'));  // true
console.log(str.includes('y')); // false
console.log(str.repeat(2));  //hahahaha

//default 函数默认参数

// es5
function foo (num) {
    num = num || 200;
    return num;
}

//es6
function foo1(num = 200) {
    return num;
}

console.log(foo());
console.log(foo1());

// rest arguments (rest 参数)
function foo2(x, y, ...rest) {
    return (x + y) * rest.length;
}
console.log(foo2(1, 2, 'hello', 'word', 99));

// Spread Operator (展开运算符)

// 组装数据
let color = ['red', 'yellow'];
let colorFul = [...color, 'white', 'black'];
console.log(colorFul);

// 获取数据除了某几项的其他项
let numList = [1, 2, 3, 4, 5, 6];
let[first, second, ...rest] = numList;
console.log(rest); // [3, 4, 5, 6]

// 对象
// 对象初始化简写

// es 5
function people (name, age) {
    return {
        name : name,
        age : age
    }
}

// es6
function people1 (name, age) {
    return {name, age};
}

// 对象字面量简写 （省略冒号与function关键字）

// es5
var people2 = {
    name : 'bai',
    getName : function () {
        console.log(this.name);
    }
};
people2.getName();

// es6
var people3 = {
    name : 'bai',
    getName ()  {
        console.log(this.name);
    }
};
people3.getName();

//Object.assign() (浅复制)
//const obj = Object.assign({}, objA, objB);
// this.seller = Object.assign(this.seller, response.data);

// Promise (用同步方式写异步代码)

// 发起异步请求
fetch('/api/todos').then(res => res.json()).then(data => ({data})).catch(err => ({err}))