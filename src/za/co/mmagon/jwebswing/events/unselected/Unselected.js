JW_APP_NAME.directive('ngUnSelected', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngUnSelected);
            element.on('unselected', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 