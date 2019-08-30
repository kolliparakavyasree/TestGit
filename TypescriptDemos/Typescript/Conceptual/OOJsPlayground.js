function HaveFun(){
    
    this.Games = [1,2,3,4]; //Global variable for this function or property
    this.Venue = "";
    this.CoOrdinator={Name:"Abridge Solutions", GamesArranged:false, lunchArranged:true};
    
    //functions
    function privateDance(){ //private
        return "PrivateDance, dance, dance";
    }

    var ppDance = function(){ //private
        return "ppDance, dance, dance";
    }

    console.log(ppDance());

    this.Dance = function(){
        return "Dance, dance, dance";
    }
}

HaveFun.prototype.PlayGames = function() {
    return "Tambola, etc..";
}

var obj = new HaveFun();
// console.log(obj);
console.log(obj.PlayGames());
// console.log(obj.privateDance());
// console.log(obj.ppDance());
// console.log(typeof(obj.Games));