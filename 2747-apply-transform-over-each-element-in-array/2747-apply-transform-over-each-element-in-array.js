/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const transform = [];
    for (let i = 0; i < arr.length; i++){
        transform[i] = fn(arr[i], i);
    }
    return transform;
};