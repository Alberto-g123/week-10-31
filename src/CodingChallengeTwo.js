console.log(doesTriangleFit([1, 1, 1], [1, 1, 1]));
console.log(doesTriangleFit([1, 1, 1], [2, 2, 2]));
console.log(doesTriangleFit([1, 2, 3], [1, 2, 2]));
console.log(doesTriangleFit([1, 2, 4], [1, 2, 6]));

function doesTriangleFit(t1, t2)
{
    let fit = t1[0] <= t2[0] && t1[1] <= t2[1] && t1[2] <= t2[2];
    if (fit)
        return (t1[0] + t1[1] > t1[2] && t1[0] + t1[2] > t1[1] && t1[1] + t1[2] > t1[0]) && (t2[0] + t2[1] > t2[2] && t2[0] + t2[2] > t2[1] && t2[1] + t2[2] > t2[0])
    return fit;
}

