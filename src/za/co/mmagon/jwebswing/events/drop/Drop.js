JW_APP_NAME.directive('ngDrop', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngDrop);
            element.on('drop', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 