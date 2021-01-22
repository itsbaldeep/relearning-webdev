// selector methods
const heading = document.getElementById("heading"); // gives one element of given id
const link = document.getElementsByClassName("link")[0]; // gives all elements of given class
const paragraph = document.getElementsByTagName("p")[0]; // gives all elements of given tag

// properties
console.log(heading.innerHTML); // gives the html written under the element
console.log(link.nodeName); // gives the name of the node

const text = paragraph.firstChild; // getting the text node from the paragraph element
console.log(text.nodeValue); // gives the value of the text node i.e., the text itself
console.log(text.nodeType); // gives a number corresponding to the node type

/* Element type NodeType
 * Element 1
 * Attribute 2
 * Text 3
 * Comment 8
 * Document 9
 */

const div = document.getElementById("empty");

// Modifying the HTML Content
div.innerHTML = "This line is dynamically added to the HTML file.";

// Modifying the HTML Style
div.style.backgroundColor = "gray";
div.style.padding = "10px";

// Adding new elements
const newHeading = document.createElement("h1");
newHeading.innerHTML = "New Heading";
div.appendChild(newHeading);

// Removing elements
// First adding a new list with 5 items
const newList = document.createElement("ul");
for (let i = 1; i < 6; i++) {
    const newItem = document.createElement("li");
    newItem.innerHTML = `Item #${i}`;
    newList.appendChild(newItem);
}
div.appendChild(newList);

// Now removing the 1st item
const list = div.lastChild;
const firstItem = list.firstChild;
list.removeChild(firstItem);

// Replacing elements
const newItem = document.createElement("li");
newItem.innerHTML = "Old list item has been replaced";
const lastItem = list.lastChild;
list.replaceChild(newItem, lastItem);

// Events
const button = document.getElementById("button");
let clicked = false;
button.onclick = function () {
    if (!clicked) {
        this.innerHTML = "I have been clicked!";
        clicked = true;
    } else {
        this.innerHTML = "Click me!";
        clicked = false;
    }
};

// does the same as above
// button.addEventListener("click", function() {
//     this.innerHTML = "I have been clicked!";
// });

// Hover event
const hover = document.getElementById("hover");
hover.onmouseenter = function () {
    this.style.color = "red";
};
hover.onmouseleave = function () {
    this.style.color = "black";
};
