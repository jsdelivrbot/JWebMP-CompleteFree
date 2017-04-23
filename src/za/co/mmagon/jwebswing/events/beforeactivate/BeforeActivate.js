JW_APP_NAME.directive('ngBeforeActivate', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngBeforeActivate);
            element.on('beforeactivate', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 