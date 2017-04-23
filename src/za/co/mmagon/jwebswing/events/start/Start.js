JW_APP_NAME.directive('ngStart', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngStart);
            element.on('start', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 