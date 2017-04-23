JW_APP_NAME.directive('ngCreate', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngCreate);
            element.on('create', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 