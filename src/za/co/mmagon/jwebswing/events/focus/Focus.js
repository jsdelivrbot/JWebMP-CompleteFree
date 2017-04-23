JW_APP_NAME.directive('ngFocus', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngFocus);
            element.on('focus', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 